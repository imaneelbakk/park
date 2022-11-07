package com.example.reminder.di

import android.content.Context
import androidx.room.Room
import com.example.reminder.data.local.ReminderDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context) = Room
        .databaseBuilder(context,ReminderDatabase::class.java,"db")
        .build()


    @Singleton
    @Provides
    fun provideMedicineDao(database: ReminderDatabase) = database.medicineDao()

}