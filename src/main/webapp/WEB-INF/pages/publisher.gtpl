<html ng-app="publisher">
<head>
    <title>Physio App</title>
  <link rel="shortcut icon" href="/images/gaelyk-small-favicon.png" type="image/png">
  <link rel="icon" href="/images/gaelyk-small-favicon.png" type="image/png">
  <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css" />
  <link rel="stylesheet" type="text/css" href="/css/bootstrap.responsive.min.css" />
  <script type="text/javascript" src="/js/jquery-1.7.2.min.js"></script>
  <script type="text/javascript" src="/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="/js/angular.js"></script>
  <script type="text/javascript" src="/js/angular-resource.js"></script>
  <script type="text/javascript" src="/js/publisher.js"></script>
</head>
<body>
<h2>yo</h2>
<h2>JavaScript Projects</h2>
<table>
  <thead>
  <tr>
    <th>Project</th>
    <th>Description</th>
    <th><a href="#/new"><i class="icon-plus-sign"></i></a></th>
  </tr>
  </thead>
  <tbody>
  <tr ng-repeat="patient in patients  | orderBy:'name'">
    <td><a href="{{patient.name}}" target="_blank">{{patient.name}}</a></td>
    <td>{{project.description}}</td>
    <td>
    </td>
  </tr>
  </tbody>
</table>
</body>
</html>