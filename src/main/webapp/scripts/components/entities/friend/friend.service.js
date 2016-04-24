"use strict";

function Friend($http) {

    var service = {
        getFriends: function() {
            return $http.get('/api/users/friends');
        },
        sendMessage: function(msg) {
            return $http.post('/api/users/sendQueryMessage', msg);
        }
    }
    return service;
}

Friend.$inject = ['$http'];

angular
    .module('sampleapplicationApp')
    .service('Friend', Friend);