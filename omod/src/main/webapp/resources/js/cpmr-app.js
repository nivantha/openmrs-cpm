/**
 * loads sub modules and wraps them up into the main module
 * this should be used for top-level module definitions only
 */

define([
		'angular',
		'config',
		'require',
		'underscore',
		'js/controllers/index',
	    'js/directives/index',
	    'js/filters/index',
	    'js/services/index'
	], function(angular) {

		'use strict';

		return angular.module('cpm-review', [
			'cpm.services',
			'cpm.controllers',
			'cpm.filters', 
			'cpm.directives'
		]);
});
