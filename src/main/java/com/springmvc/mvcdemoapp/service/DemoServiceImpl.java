package com.springmvc.mvcdemoapp.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class DemoServiceImpl implements DemoService {

  private final ChuckNorrisQuotes chuckNorrisQuotes;

  public DemoServiceImpl() {
    this.chuckNorrisQuotes = new ChuckNorrisQuotes();
  }

  @Override
  public String getService() {
    return chuckNorrisQuotes.getRandomQuote();
  }
  
}
