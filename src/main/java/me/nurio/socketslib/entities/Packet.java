package me.nurio.socketslib.entities;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/**
 * This class represents a network packet without implementation.
 * Each packet should create his own way to store data to read or write them.
 */
public interface Packet {

    /**
     * Read necessary data from provided DataStream.
     *
     * @param inputStream byte data source.
     */
    void read(DataInputStream inputStream);

    /**
     * Write packet data to provided DataStream.
     *
     * @param outputStream byte data destination.
     */
    void write(DataOutputStream outputStream);

}