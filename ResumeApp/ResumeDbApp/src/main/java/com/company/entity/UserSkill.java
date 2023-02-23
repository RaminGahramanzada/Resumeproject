/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.entity;

/**
 *
 * @author Lenovo
 */
public class UserSkill {
  
    private int id;
    private User user;
    private Skill skills;
    private int power;

    public UserSkill(Integer id, User user, Skill skill, int power) {
        this.id = id;
        this.user = user;
        this.skills = skill;
        this.power = power;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Skill getSkill() {
        return skills;
    }

    public void setSkill(Skill skill) {
        this.skills = skill;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "UserSkill{" + "id=" + id + ", user=" + user + ", skill=" + skills + ", power=" + power + '}';
    }


}
