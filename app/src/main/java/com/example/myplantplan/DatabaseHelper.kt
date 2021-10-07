package com.example.myplantplan

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.database.Cursor
import android.database.sqlite.SQLiteException

class DatabaseHelper(context: Context):
    SQLiteOpenHelper(context, DATABASE_NAME,null,DATABASE_VERSION) {

    companion object {


        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "EmployeeDatabase"
        private const val TABLE_USERS = "UsersTable"

        private const val KEY_ID = "_id"
        private const val KEY_NAME = "name"
        private const val KEY_PASSWORD = "password"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_USERS_TABLE = ("CREATE TABLE " + TABLE_USERS + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT,"
                + KEY_PASSWORD + " TEXT" + ")")
        db?.execSQL(CREATE_USERS_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS $TABLE_USERS")
    }

    fun addUser(emp: UsermodelClass): Long {
        val db = this.writableDatabase

        val contentValues = ContentValues()
        contentValues.put(KEY_NAME, emp.name) // UserModelClass Name
        contentValues.put(KEY_PASSWORD,emp.pass) //UserModelClass Password

        // Inserting employee details using insert query.
        val success = db.insert(TABLE_USERS, null, contentValues)
        //2nd argument is String containing nullColumnHack

        db.close() // Closing database connection
        return success
    }
    fun updateUser(emp: UsermodelClass): Int {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(KEY_NAME, emp.name) // EmpModelClass Name
        contentValues.put(KEY_PASSWORD,emp.pass) //UserModelClass Password

        // Updating Row
        val success = db.update(TABLE_USERS, contentValues, KEY_ID + "=" + emp.id, null)
        //2nd argument is String containing nullColumnHack

        // Closing database connection
        db.close()
        return success
    }
    fun checkUser(user: String, pass: String): Boolean{
        val columns = arrayOf(KEY_ID)
        val db = this.readableDatabase
        val selection = "$KEY_NAME = ? AND $KEY_PASSWORD = ?"
        val selectionArgs = arrayOf(user,pass)

        val cursor = db.query(TABLE_USERS, columns, selection, selectionArgs,null,null,null)

        val cursorCount = cursor.count
        cursor.close()
        db.close()
        if (cursorCount > 0)
            return true

        return false
    }
}