package org.column4j.index.v3.chunk.primitive;

import org.column4j.index.v3.chunk.ChunkIndex;

import javax.annotation.Nullable;

public interface Int16ChunkIndex extends ChunkIndex {

    /**
     * checks if chunk contains value
     * @param value searched value
     * @return check result
     */
    boolean contains(short value);


    /**
     * looks up indices of values in chunk
     * @param value searched value
     * @return indices of value
     */
    @Nullable
    int[] lookupValues(short value);
}
