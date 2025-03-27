package com.garage.garage_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
    @Entity
    public class Car {

        @Id
        private String immatriculation;
        private String marque;
        private String modele;
        private String etat;

        // Constructeur par défaut
        public Car() {}

        // Constructeur avec paramètres
        public Car(String immatriculation, String marque, String modele, String etat) {
            this.immatriculation = immatriculation;
            this.marque = marque;
            this.modele = modele;
            this.etat = etat;
        }

        // Getters et Setters
        public String getImmatriculation() { return immatriculation; }
        public void setImmatriculation(String immatriculation) { this.immatriculation = immatriculation; }

        public String getMarque() { return marque; }
        public void setMarque(String marque) { this.marque = marque; }

        public String getModele() { return modele; }
        public void setModele(String modele) { this.modele = modele; }

        public String getEtat() { return etat; }
        public void setEtat(String etat) { this.etat = etat; }
    }






