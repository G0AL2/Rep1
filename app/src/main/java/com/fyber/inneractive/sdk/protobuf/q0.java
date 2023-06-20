package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;

/* loaded from: classes2.dex */
public interface q0 extends r0 {

    /* loaded from: classes2.dex */
    public interface a extends r0, Cloneable {
    }

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    i toByteString();

    void writeTo(l lVar) throws IOException;
}
