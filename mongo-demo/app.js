const mongose=require('mongose')
const morgan=require('morgan');
const validator=require('validator');
const helmet=require('helmet');

name:String
require:true

email:String
require:true

age:Number
require:true