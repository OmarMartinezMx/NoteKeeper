package com.example.notekeeper

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init{
        initializeCourses()
        initializeNotes()
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

    private fun initializeNotes(){
        var note = courses["android_intent"]?.let { NoteInfo(it, "Note 1", "Lorem ipsum dolor a sit met...") }
        note?.let { notes.add(it) }
        note = courses["android_intent"]?.let { NoteInfo(it, "Note 2", "Lorem ipsum dolor a sit met...") }
        note?.let { notes.add(it) }
        note = courses["android_async"]?.let { NoteInfo(it, "Note 3", "Lorem ipsum dolor a sit met...") }
        note?.let { notes.add(it) }
        note = courses["java_lang"]?.let { NoteInfo(it, "Note 4", "Lorem ipsum dolor a sit met...") }
        note?.let { notes.add(it) }
        note = courses["java_core"]?.let { NoteInfo(it, "Note 5", "Lorem ipsum dolor a sit met...") }
        note?.let { notes.add(it) }
    }
}