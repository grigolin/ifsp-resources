/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.h to edit this template
 */

/* 
 * File:   Volume.h
 * Author: Gui
 *
 * Created on 13 de Setembro de 2023, 00:08
 */

#ifndef VOLUME_H
#define VOLUME_H

class Volume {
public:
    void Receba();
    float Calcular(float raio);
    
    Volume();
    Volume(const Volume& orig);
    virtual ~Volume();
private:

};

#endif /* VOLUME_H */

