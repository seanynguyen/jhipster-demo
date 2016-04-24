'use strict';

angular.module('sampleapplicationApp')
    .controller('FriendController', function ($scope, $state, Friend) {

        $scope.friends = [];
       $scope.loadAll = function() {
            Friend.getFriends(function(result) {
               $scope.friends = result.data;
            });
        };
        $scope.loadAll();


        $scope.refresh = function () {
            $scope.loadAll();
            $scope.clear();
        };

        $scope.clear = function () {
            $scope.friend = {
                name: null,
                email: null,
                status: null
            };
        };
    });
