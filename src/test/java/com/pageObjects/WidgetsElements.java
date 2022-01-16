package com.pageObjects;

public class WidgetsElements {
public static String ControlGroup="//a[contains(@href,'http://jqueryui.com/controlgroup/')]";
public static String Automatic= "//*[@id='transmission-automatic']/preceding::*[contains(text(),'Automatic')]";
public static String Insurance= "//*[@id='transmission-automatic']/following-sibling::*[contains(text(),'Insurance')]";
public static String AutomaticVertical="//*[@id='transmission-standard-v']/following::*[contains(text(),'Automatic')]";
public static String InsuranceVertical="//*[@id='transmission-automatic-v']/following::*[contains(text(),'Insurance')]";
public static String BookNow= "book";
}
