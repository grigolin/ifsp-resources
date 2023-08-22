/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/class.h to edit this template
 */

/* 
 * File:   cMedia.h
 * Author: veterano
 *
 * Created on 22 de agosto de 2023, 07:32
 */

#ifndef CMEDIA_H
#define CMEDIA_H

class cMedia {
public:
    void Receber();
    float Calcular(float n1,float n2,float n3, char l);
    cMedia();
    cMedia(const cMedia& orig);
    virtual ~cMedia();
private:

};

#endif /* CMEDIA_H */

