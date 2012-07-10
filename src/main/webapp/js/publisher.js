// This is a module for cloud persistance in mongolab - https://mongolab.com
angular.module('patients', ['ngResource']).
    factory('Patient', function($resource) {
            console.log('patient being built out')

      var Patient = $resource('/patientList', {
            update: { method: 'PUT' }
          }
      );
      return Patient;
    });


console.log('inside of angular');

angular.module('publisher', ['patients']).
  config(function($routeProvider) {
    $routeProvider.
      when('/', {controller:ListCtrl, templateUrl:'list.html'}).
      when('/publisher', {controller:ListCtrl, templateUrl:'list.html'}).
      otherwise({redirectTo:'/publisher2'});
  });

function ListCtrl($scope, Patient) {
    console.log('list controller');

  $scope.patients = Patient.query();
}



