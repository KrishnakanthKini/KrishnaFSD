const mongoose=require('mongoose');
require('./connection');

    const courseSchema=new mongoose.Schema({
        name:String,
        author:String,
        tags:[String],
        date:{type:Date,default:Date.now},
        price:Number,
        isPublished:Boolean
    });
    const Course=mongoose.model('Course',courseSchema);
    let course=new Course({
        name:'Pro Spring',
        author:'Rod Johnson',
        tags:['Spring','Middleware'],
        price:15,
        isPublished:true
    
    });
    async function createCourse()
    {
       return await course.save();
        
    }
    
async function getCourses() {
    //return await Course
    //.find({isPublished:false}).select('name author price');
    return await Course
  .find({ isPublished: true, tags: 'backend' })
  .sort({ name: 1,author:1 })
  .select( 'name author' );
    
  }
  
  async function run() {
      const course=await createCourse();
      console.log(course);
    //const courses = await getCourses();
    //console.log(courses);
  }
  
  run();