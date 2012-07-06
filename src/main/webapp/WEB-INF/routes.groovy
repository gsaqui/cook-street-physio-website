
get "/", forward: "/WEB-INF/pages/index.gtpl"
get "/update", forward: "/WEB-INF/pages/update.gtpl"
get "/datetime", forward: "/datetime.groovy"

get "/favicon.ico", redirect: "/images/gaelyk-small-favicon.png"
post '/addPatient', forward: '/addPatient.groovy'