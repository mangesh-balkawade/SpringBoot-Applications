package main

import (
	"encoding/json"
	"net/http"

	"github.com/gorilla/mux"
)

func create(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content.Type", "application/json")

	var emp Employee
	json.NewDecoder(r.Body).Decode(&emp)
	database.Create(&emp)
	json.NewEncoder(w).Encode(emp)
}


func getALl(w http.ResponseWriter, r *http.Request) {
	//w.Header().Set("Content.Type", "application/json")

	var emp []Employee
	database.Find(&emp)
	json.NewEncoder(w).Encode(emp)
}

func getById(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content.Type", "application/json")

	var emp Employee
	database.First(&emp,mux.Vars(r)["id"])
	json.NewEncoder(w).Encode(emp)
}
