package com.google.gson.internal;

import com.google.gson.stream.JsonReader;
import java.io.IOException;

/* compiled from: JsonReaderInternalAccess.java */
/* loaded from: classes3.dex */
public abstract class e {
    public static e INSTANCE;

    public abstract void promoteNameToValue(JsonReader jsonReader) throws IOException;
}
