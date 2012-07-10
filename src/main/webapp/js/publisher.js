// This is a module for cloud persistance in mongolab - https://mongolab.com
angular.module('patients', ['ngResource']).
        factory('Patient', function($resource) {
            var Patient = $resource('/patientList', {
                        update: { method: 'PUT' }
                    }
            );
            return Patient;
        });


angular.module('publisher', ['patients']).
        config(function($routeProvider) {
            $routeProvider.
                    when('/', {controller:ListCtrl, templateUrl:'list.html'}).
                    when('/publisher', {controller:ListCtrl, templateUrl:'list.html'}).
                    otherwise({redirectTo:'/'});
        });

function ListCtrl($scope, Patient) {
    $scope.patients = Patient.query();
}



