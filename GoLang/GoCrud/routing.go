package main

import (
	"log"
	"net/http"
	"github.com/gorilla/handlers"
	"github.com/gorilla/mux"
)

// func handlers() {
// 	r := mux.NewRouter()

// 	r.HandleFunc("/create", create).Methods("POST")
// 	r.HandleFunc("/getAll",getALl).Methods("GET")
// 	r.HandleFunc("/getById/{id}",getById).Methods("GET")

//		log.Fatal(http.ListenAndServe(":8080", r))
//	}
func handler() {
	r := mux.NewRouter()

	r.HandleFunc("/create", create).Methods("POST")
	r.HandleFunc("/getAll", getALl).Methods("GET")
	r.HandleFunc("/getById/{id}", getById).Methods("GET")

	// Add CORS middleware
	headers := handlers.AllowedHeaders([]string{"X-Requested-With", "Content-Type", "Authorization"})
	methods := handlers.AllowedMethods([]string{"GET", "POST", "PUT", "DELETE", "OPTIONS"})
	origins := handlers.AllowedOrigins([]string{"*"})

	log.Fatal(http.ListenAndServe(":8080", handlers.CORS(headers, methods, origins)(r)))
}
