package main

import (
	"fmt"
	"gorm.io/driver/mysql"
	"gorm.io/gorm"
)

var database *gorm.DB
//user:password@tcp(127.0.0.1:3306)/dbname?charset=utf8mb4&parseTime=True&loc=Local

var urlDsn = "root:root@tcp(localhost:3306)/go?charset=utf8mb4&parseTime=True&loc=Local"
var err error

func connection() {
	database, err = gorm.Open(mysql.Open(urlDsn),&gorm.Config{})
	if err!=nil{
		fmt.Print(err.Error())
		panic("connection failed")
	}
	database.AutoMigrate(&Employee{})
}
