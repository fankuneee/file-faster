package com.github.fankuneee.filefaster.services

import com.intellij.openapi.project.Project
import com.github.fankuneee.filefaster.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
