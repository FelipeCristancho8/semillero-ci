package com.felipe.semillero.counter;

import com.felipe.semillero.model.Summary;

import java.io.IOException;

public interface WordCounter {

    Summary process(String pathFile) throws IOException;
}
