'use strict';

angular.module('sampleapplicationApp')
    .controller('FriendController', function ($scope, $state, Friend) {

        $scope.friends = [];
       $scope.loadAll = function() {
            Friend.getFriends().then(function(result) {
               $scope.friends = result.data;
            });
        };
        $scope.loadAll();

        $scope.sendMessage = function(message) {
            $scope.messageData = [];
            Friend.sendMessage(message).then(function(result) {
                $scope.messageData = result.data;
            });
        };


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
