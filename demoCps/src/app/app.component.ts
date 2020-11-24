import { Component } from '@angular/core';
import { Platform, AlertController } from 'ionic-angular';
import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';

import { TabsPage } from '../pages/tabs/tabs';
import { NgForm } from '@angular/forms';
import { RestProvider } from '../providers/rest/rest';

@Component({
  templateUrl: 'app.html'
})
export class MyApp {
  rootPage: any = TabsPage;
  regionSelected: number;
  paisSelected: number;
  regiones: any[];
  paises: any[];
  tarifa: any[];
  peso: number;
  alto: number;
  ancho: number;
  largo: number;
  descuento: number = 0;

  constructor(platform: Platform,
    statusBar: StatusBar,
    splashScreen: SplashScreen,
    public provider: RestProvider,
    public alertCtrl: AlertController,) {
    platform.ready().then(() => {
      // Okay, so the platform is ready and our plugins are available.
      // Here you can do any higher level native things you might need.
      statusBar.styleDefault();
      splashScreen.hide();
    });
    this.loadRegion();
  }
  onSubmit(form: NgForm) {
    let buttons = [
      {
        text: 'Aceptar'
      }
    ];
    console.log(this.tarifa[0].tarifa);
    let total = ((this.peso * this.tarifa[0].tarifa) + 1.66 * this.alto * this.largo * this.ancho)-(this.descuento*0.5*this.peso);
    let alert = this.alertCtrl.create({
      title: 'Precio del producto: ',
      subTitle: total + '',
      buttons: buttons,
      cssClass: 'alertDanger'
    });
    alert.present();


  }

  loadRegion() {
    this.provider.getRegion().then((data: any[]) => {
      this.regiones = data;
      console.log(this.regiones);
    }).catch(data => {
    });
  }
  loadPais(region: number) {
    this.provider.getPais(region).then((data: any[]) => {
      this.paises = data;
      console.log(this.paises);
    }).catch(data => {
    });
  }
  loadTarifa(pais: number) {
    this.provider.getTarifa(pais).then((data: any[]) => {
      this.tarifa = data;
      console.log(this.tarifa);
    }).catch(data => {
    });
  }
}
