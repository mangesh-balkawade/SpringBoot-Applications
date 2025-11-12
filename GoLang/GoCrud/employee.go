package main


type Employee struct {
	// filds should start with pascal case
	Name  string `json:"name"`
	Sal   float64 `json:"sal"`
	Email string  `json:"email"`
}