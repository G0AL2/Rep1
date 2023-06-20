package com.apm.insight.l;

import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    final Writer f6486a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f6487b = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum a {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    public m(Writer writer) {
        this.f6486a = writer;
    }

    private void a(a aVar) {
        List<a> list = this.f6487b;
        list.set(list.size() - 1, aVar);
    }

    private void a(JSONArray jSONArray) {
        a();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            a(jSONArray.get(i10));
        }
        b();
    }

    public static void a(JSONArray jSONArray, Writer writer) {
        new m(writer).a(jSONArray);
        writer.flush();
    }

    private void a(JSONObject jSONObject) {
        c();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            a(next).a(jSONObject.get(next));
        }
        d();
    }

    public static void a(JSONObject jSONObject, Writer writer) {
        new m(writer).a(jSONObject);
        writer.flush();
    }

    private void b(String str) {
        Writer writer;
        String str2;
        this.f6486a.write("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '\f') {
                writer = this.f6486a;
                str2 = "\\f";
            } else if (charAt != '\r') {
                if (charAt == '\"' || charAt == '/' || charAt == '\\') {
                    this.f6486a.write(92);
                } else {
                    switch (charAt) {
                        case '\b':
                            writer = this.f6486a;
                            str2 = "\\b";
                            break;
                        case '\t':
                            writer = this.f6486a;
                            str2 = "\\t";
                            break;
                        case '\n':
                            writer = this.f6486a;
                            str2 = "\\n";
                            break;
                        default:
                            if (charAt <= 31) {
                                this.f6486a.write(String.format("\\u%04x", Integer.valueOf(charAt)));
                                break;
                            }
                            break;
                    }
                }
                this.f6486a.write(charAt);
            } else {
                writer = this.f6486a;
                str2 = "\\r";
            }
            writer.write(str2);
        }
        this.f6486a.write("\"");
    }

    private a e() {
        List<a> list = this.f6487b;
        return list.get(list.size() - 1);
    }

    private void f() {
        a e10 = e();
        if (e10 == a.NONEMPTY_OBJECT) {
            this.f6486a.write(44);
        } else if (e10 != a.EMPTY_OBJECT) {
            throw new JSONException("Nesting problem");
        }
        a(a.DANGLING_KEY);
    }

    private void g() {
        a aVar;
        if (this.f6487b.isEmpty()) {
            return;
        }
        a e10 = e();
        if (e10 == a.EMPTY_ARRAY) {
            aVar = a.NONEMPTY_ARRAY;
        } else if (e10 == a.NONEMPTY_ARRAY) {
            this.f6486a.write(44);
            return;
        } else if (e10 != a.DANGLING_KEY) {
            if (e10 != a.NULL) {
                throw new JSONException("Nesting problem");
            }
            return;
        } else {
            this.f6486a.write(":");
            aVar = a.NONEMPTY_OBJECT;
        }
        a(aVar);
    }

    public m a() {
        return a(a.EMPTY_ARRAY, "[");
    }

    m a(a aVar, a aVar2, String str) {
        e();
        List<a> list = this.f6487b;
        list.remove(list.size() - 1);
        this.f6486a.write(str);
        return this;
    }

    m a(a aVar, String str) {
        g();
        this.f6487b.add(aVar);
        this.f6486a.write(str);
        return this;
    }

    public m a(Object obj) {
        Writer writer;
        String numberToString;
        if (obj instanceof JSONArray) {
            a((JSONArray) obj);
            return this;
        } else if (obj instanceof JSONObject) {
            a((JSONObject) obj);
            return this;
        } else {
            g();
            if (obj == null || obj == JSONObject.NULL) {
                this.f6486a.write("null");
            } else {
                if (obj instanceof Boolean) {
                    writer = this.f6486a;
                    numberToString = String.valueOf(obj);
                } else if (obj instanceof Number) {
                    writer = this.f6486a;
                    numberToString = JSONObject.numberToString((Number) obj);
                } else {
                    b(obj.toString());
                }
                writer.write(numberToString);
            }
            return this;
        }
    }

    public m a(String str) {
        f();
        b(str);
        return this;
    }

    public m b() {
        return a(a.EMPTY_ARRAY, a.NONEMPTY_ARRAY, "]");
    }

    public m c() {
        return a(a.EMPTY_OBJECT, "{");
    }

    public m d() {
        return a(a.EMPTY_OBJECT, a.NONEMPTY_OBJECT, "}");
    }

    public String toString() {
        return "";
    }
}
