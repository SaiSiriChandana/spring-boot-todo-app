package com.example.demo.model;
public class Task {
        private int id;
        private String title;
        private boolean completed;

        // Constructors
        public Task() {}
        public Task(int id, String title) {
            this.id = id;
            this.title = title;
            this.completed = false;
        }
        // Getters & Setters
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getTitle() { return title; }
        public void setTitle(String title) { this.title = title; }
        public boolean isCompleted() { return completed; }
        public void setCompleted(boolean completed) { this.completed = completed; }
    }


