package com.nikskul.kafkabanking.producer;

public interface KafkaSender<K,V> {

    void sendToKafka(K key, V value);

    void sendToKafka(V value);

}
