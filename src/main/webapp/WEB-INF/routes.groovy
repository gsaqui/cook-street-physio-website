
get "/", forward: "/WEB-INF/pages/index.gtpl"
get "/update", forward: "/WEB-INF/pages/update.gtpl"
get "/publisher", forward: "/WEB-INF/pages/publisher.gtpl"
get "/datetime", forward: "/datetime.groovy"

get "/favicon.ico", redirect: "/images/gaelyk-small-favicon.png"


get '/patientList', forward: '/patientList.groovy'
post '/addPatient', forward: '/addPatient.groovy'