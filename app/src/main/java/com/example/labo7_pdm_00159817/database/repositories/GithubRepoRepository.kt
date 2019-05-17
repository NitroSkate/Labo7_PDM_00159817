package com.example.labo7_pdm_00159817.database.repositories

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.labo7_pdm_00159817.database.daos.GithubDAO
import com.example.labo7_pdm_00159817.database.entities.GithubRepo

class GithubRepoRepository(private val repoDao : GithubDAO){

    fun getAll(): LiveData<List<GithubRepo>> = repoDao.getAll()


    fun nukeTable() = repoDao.nukeTable()

    @WorkerThread //Hilo donde va a trabajar
    suspend fun insert(repo: GithubRepo) = repoDao.insert(repo)



}