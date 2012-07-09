import com.google.appengine.api.datastore.*


def patients = datastore.execute {
    select all from patient
    limit 200
}

def a = []
patients.each{
    a << ['name': it.name, 'areaOfInjury': it.areaOfInjury ]
}
def builder = new groovy.json.JsonBuilder(a)

response.contentType = "application/json"
response.getWriter().write builder.toString()