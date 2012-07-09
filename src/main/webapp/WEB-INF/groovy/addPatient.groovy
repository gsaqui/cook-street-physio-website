import com.google.appengine.api.datastore.*

def builder = new groovy.json.JsonBuilder([['name':'a', 'people':'b'], ['name':'d', 'people':'c']])

def e = new Entity("patient")
e.id = UUID.randomUUID().toString().replaceAll('-','')
e.name = params.name
e.dateOfBirth = params.'date-of-birth'
e.address = params.address
e.phoneNumber = params.'phone-number'
e.referred = params.'referred'
e.physicianName = params.'physician-name'
e.discussWithPhysician = params.'discuss-with-physician'
e.personalHealthNumber = params.'personal-health-number'
e.icbcNumber = params.'icbc-number'
e.primaryComplaint = params.'primary-complaint'
e.areaOfInjury = params.'area-of-injury'
e.dateOfInjury = params.'date-of-injury'
e.mechanismOfInjury = params.'mechanism-of-injury'
e.haveHadInjuryBefore = params.'have-had-injury-before'
e.historyOfIllness = params.'history-of-illness'
e.currentMedications = params.'current-medications'
e.dizziness = params.'dizziness'
e.arthritis = params.'arthritis'
e.diabetes = params.'diabetes'
e.heartTrouble = params.'heart-trouble'
e.asthma = params.'asthma'
e.numbnessOrTingling = params.'numbness-or-tingling'
e.chestPain = params.'chest-pain'
e.cancer = params.'cancer'
e.highBloodPressure = params.'high-blood-pressure'
e.pastSurgeries = params.'past-surgeries'
e.notPerformExercise = params.'not-perform-exercise'
e.save()

def toAddress = params.'email-of-office'
mail.send from: "glenn.saqui@gmail.com",
            to: toAddress,
            subject: "Patient ${params.name}",
            textBody: """
name = ${params.name}
date of birth = ${params.'date-of-birth'}
address = ${params.address}
phone number = ${params.'phone-number'}
referred = ${params.'referred'}
physician name = ${params.'physician-name'}
discuss with physician = ${params.'discuss-with-physician'}
personal health number = ${params.'personal-health-number'}
icbc number = ${params.'icbc-number'}
primary complaint = ${params.'primary-complaint'}
area of injury = ${params.'area-of-injury'}
date of injury = ${params.'date-of-injury'}
mechanism of injury = ${params.'mechanism-of-injury'}
have had injury before = ${params.'have-had-injury-before'}
history of illness = ${params.'history-of-illness'}
current medications = ${params.'current-medications'}
dizziness = ${params.'dizziness'}
arthritis = ${params.'arthritis'}
diabetes = ${params.'diabetes'}
heart trouble = ${params.'heart-trouble'}
asthma = ${params.'asthma'}
numbness or tingling = ${params.'numbness-or-tingling'}
chest pain = ${params.'chest-pain'}
cancer = ${params.'cancer'}
high blood pressure = ${params.'high-blood-pressure'}
past surgeries = ${params.'past-surgeries'}
not perform exercise = ${params.'not-perform-exercise'}
            """



response.contentType = "application/json"
response.getWriter().write builder.toString()