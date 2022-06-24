package com.springmvc.mvcdemoapp.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class DemoServiceImpl implements DemoService {

  private final ChuckNorrisQuotes chuckNorrisQuotes;

  // public DemoServiceImpl() {
  //   this.chuckNorrisQuotes = new ChuckNorrisQuotes(); //hardcoded the object which is not suggested 
  // }

  public DemoServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
    this.chuckNorrisQuotes = chuckNorrisQuotes;
  }
  

  @Override
  public String getService() {
    return chuckNorrisQuotes.getRandomQuote();
  }

 
  
}
