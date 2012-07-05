def builder = new groovy.json.JsonBuilder(['name':'a', 'people':'b'])

response.contentType = "application/json"
response.getWriter().write builder.toString()