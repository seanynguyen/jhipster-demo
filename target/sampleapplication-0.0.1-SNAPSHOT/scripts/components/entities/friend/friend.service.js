"use strict";

function Friend($http) {

    var service = {
        getFriends: function() {
            return $http.get('/api/users/friends');
        }
    }
    return service;
}

Friend.$inject = ['$http'];

angular
    .module('sampleapplicationApp')
    .service('Friend', Friend);