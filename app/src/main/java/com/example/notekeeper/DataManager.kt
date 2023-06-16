package com.example.notekeeper

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init{
        initializeCourses()
    }

    private fun initializeCourses(){
        var course = CourseInfo("android_intent", "Android programing with intents")
        courses[course.courseId] = course

        course = CourseInfo(courseId = "android_async", title = "Android Async Programming")
        courses[course.courseId] = course

        course = CourseInfo(courseId = "java_lang", title = "Java Fundamentals")
        courses[course.courseId] = course

        course = CourseInfo("java_core", "The Java Core Platform")
        courses[course.courseId] = course
    }
}