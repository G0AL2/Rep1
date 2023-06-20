package com.google.gson;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;

/* compiled from: JsonElement.java */
/* loaded from: classes3.dex */
public abstract class h {
    public e e() {
        if (i()) {
            return (e) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public k f() {
        if (k()) {
            return (k) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public m g() {
        if (l()) {
            return (m) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean i() {
        return this instanceof e;
    }

    public boolean j() {
        return this instanceof j;
    }

    public boolean k() {
        return this instanceof k;
    }

    public boolean l() {
        return this instanceof m;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.setLenient(true);
            com.google.gson.internal.k.b(this, jsonWriter);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
