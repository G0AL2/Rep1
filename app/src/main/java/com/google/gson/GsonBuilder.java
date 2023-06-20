package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class GsonBuilder {
    private boolean complexMapKeySerialization;
    private String datePattern;
    private int dateStyle;
    private boolean escapeHtmlChars;
    private Excluder excluder;
    private final List<r> factories;
    private FieldNamingStrategy fieldNamingPolicy;
    private boolean generateNonExecutableJson;
    private final List<r> hierarchyFactories;
    private final Map<Type, d<?>> instanceCreators;
    private boolean lenient;
    private q longSerializationPolicy;
    private boolean prettyPrinting;
    private boolean serializeNulls;
    private boolean serializeSpecialFloatingPointValues;
    private int timeStyle;

    public GsonBuilder() {
        this.excluder = Excluder.f23717g;
        this.longSerializationPolicy = q.f23895a;
        this.fieldNamingPolicy = c.f23709a;
        this.instanceCreators = new HashMap();
        this.factories = new ArrayList();
        this.hierarchyFactories = new ArrayList();
        this.serializeNulls = false;
        this.dateStyle = 2;
        this.timeStyle = 2;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        this.escapeHtmlChars = true;
        this.prettyPrinting = false;
        this.generateNonExecutableJson = false;
        this.lenient = false;
    }

    private void addTypeAdaptersForDate(String str, int i10, int i11, List<r> list) {
        DefaultDateTypeAdapter defaultDateTypeAdapter;
        DefaultDateTypeAdapter defaultDateTypeAdapter2;
        DefaultDateTypeAdapter defaultDateTypeAdapter3;
        if (str != null && !"".equals(str.trim())) {
            defaultDateTypeAdapter = new DefaultDateTypeAdapter(Date.class, str);
            defaultDateTypeAdapter2 = new DefaultDateTypeAdapter(Timestamp.class, str);
            defaultDateTypeAdapter3 = new DefaultDateTypeAdapter(java.sql.Date.class, str);
        } else if (i10 == 2 || i11 == 2) {
            return;
        } else {
            DefaultDateTypeAdapter defaultDateTypeAdapter4 = new DefaultDateTypeAdapter(Date.class, i10, i11);
            DefaultDateTypeAdapter defaultDateTypeAdapter5 = new DefaultDateTypeAdapter(Timestamp.class, i10, i11);
            DefaultDateTypeAdapter defaultDateTypeAdapter6 = new DefaultDateTypeAdapter(java.sql.Date.class, i10, i11);
            defaultDateTypeAdapter = defaultDateTypeAdapter4;
            defaultDateTypeAdapter2 = defaultDateTypeAdapter5;
            defaultDateTypeAdapter3 = defaultDateTypeAdapter6;
        }
        list.add(TypeAdapters.b(Date.class, defaultDateTypeAdapter));
        list.add(TypeAdapters.b(Timestamp.class, defaultDateTypeAdapter2));
        list.add(TypeAdapters.b(java.sql.Date.class, defaultDateTypeAdapter3));
    }

    public GsonBuilder addDeserializationExclusionStrategy(a aVar) {
        this.excluder = this.excluder.q(aVar, false, true);
        return this;
    }

    public GsonBuilder addSerializationExclusionStrategy(a aVar) {
        this.excluder = this.excluder.q(aVar, true, false);
        return this;
    }

    public Gson create() {
        List<r> arrayList = new ArrayList<>(this.factories.size() + this.hierarchyFactories.size() + 3);
        arrayList.addAll(this.factories);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.hierarchyFactories);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        addTypeAdaptersForDate(this.datePattern, this.dateStyle, this.timeStyle, arrayList);
        return new Gson(this.excluder, this.fieldNamingPolicy, this.instanceCreators, this.serializeNulls, this.complexMapKeySerialization, this.generateNonExecutableJson, this.escapeHtmlChars, this.prettyPrinting, this.lenient, this.serializeSpecialFloatingPointValues, this.longSerializationPolicy, this.datePattern, this.dateStyle, this.timeStyle, this.factories, this.hierarchyFactories, arrayList);
    }

    public GsonBuilder disableHtmlEscaping() {
        this.escapeHtmlChars = false;
        return this;
    }

    public GsonBuilder disableInnerClassSerialization() {
        this.excluder = this.excluder.c();
        return this;
    }

    public GsonBuilder enableComplexMapKeySerialization() {
        this.complexMapKeySerialization = true;
        return this;
    }

    public GsonBuilder excludeFieldsWithModifiers(int... iArr) {
        this.excluder = this.excluder.r(iArr);
        return this;
    }

    public GsonBuilder excludeFieldsWithoutExposeAnnotation() {
        this.excluder = this.excluder.i();
        return this;
    }

    public GsonBuilder generateNonExecutableJson() {
        this.generateNonExecutableJson = true;
        return this;
    }

    public GsonBuilder registerTypeAdapter(Type type, Object obj) {
        boolean z10 = obj instanceof o;
        com.google.gson.internal.a.a(z10 || (obj instanceof g) || (obj instanceof d) || (obj instanceof TypeAdapter));
        if (obj instanceof d) {
            this.instanceCreators.put(type, (d) obj);
        }
        if (z10 || (obj instanceof g)) {
            this.factories.add(TreeTypeAdapter.f(com.google.gson.reflect.a.b(type), obj));
        }
        if (obj instanceof TypeAdapter) {
            this.factories.add(TypeAdapters.a(com.google.gson.reflect.a.b(type), (TypeAdapter) obj));
        }
        return this;
    }

    public GsonBuilder registerTypeAdapterFactory(r rVar) {
        this.factories.add(rVar);
        return this;
    }

    public GsonBuilder registerTypeHierarchyAdapter(Class<?> cls, Object obj) {
        boolean z10 = obj instanceof o;
        com.google.gson.internal.a.a(z10 || (obj instanceof g) || (obj instanceof TypeAdapter));
        if ((obj instanceof g) || z10) {
            this.hierarchyFactories.add(TreeTypeAdapter.g(cls, obj));
        }
        if (obj instanceof TypeAdapter) {
            this.factories.add(TypeAdapters.e(cls, (TypeAdapter) obj));
        }
        return this;
    }

    public GsonBuilder serializeNulls() {
        this.serializeNulls = true;
        return this;
    }

    public GsonBuilder serializeSpecialFloatingPointValues() {
        this.serializeSpecialFloatingPointValues = true;
        return this;
    }

    public GsonBuilder setDateFormat(String str) {
        this.datePattern = str;
        return this;
    }

    public GsonBuilder setExclusionStrategies(a... aVarArr) {
        for (a aVar : aVarArr) {
            this.excluder = this.excluder.q(aVar, true, true);
        }
        return this;
    }

    public GsonBuilder setFieldNamingPolicy(c cVar) {
        this.fieldNamingPolicy = cVar;
        return this;
    }

    public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy fieldNamingStrategy) {
        this.fieldNamingPolicy = fieldNamingStrategy;
        return this;
    }

    public GsonBuilder setLenient() {
        this.lenient = true;
        return this;
    }

    public GsonBuilder setLongSerializationPolicy(q qVar) {
        this.longSerializationPolicy = qVar;
        return this;
    }

    public GsonBuilder setPrettyPrinting() {
        this.prettyPrinting = true;
        return this;
    }

    public GsonBuilder setVersion(double d10) {
        this.excluder = this.excluder.s(d10);
        return this;
    }

    public GsonBuilder setDateFormat(int i10) {
        this.dateStyle = i10;
        this.datePattern = null;
        return this;
    }

    public GsonBuilder setDateFormat(int i10, int i11) {
        this.dateStyle = i10;
        this.timeStyle = i11;
        this.datePattern = null;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GsonBuilder(Gson gson) {
        this.excluder = Excluder.f23717g;
        this.longSerializationPolicy = q.f23895a;
        this.fieldNamingPolicy = c.f23709a;
        HashMap hashMap = new HashMap();
        this.instanceCreators = hashMap;
        ArrayList arrayList = new ArrayList();
        this.factories = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.hierarchyFactories = arrayList2;
        this.serializeNulls = false;
        this.dateStyle = 2;
        this.timeStyle = 2;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        this.escapeHtmlChars = true;
        this.prettyPrinting = false;
        this.generateNonExecutableJson = false;
        this.lenient = false;
        this.excluder = gson.excluder;
        this.fieldNamingPolicy = gson.fieldNamingStrategy;
        hashMap.putAll(gson.instanceCreators);
        this.serializeNulls = gson.serializeNulls;
        this.complexMapKeySerialization = gson.complexMapKeySerialization;
        this.generateNonExecutableJson = gson.generateNonExecutableJson;
        this.escapeHtmlChars = gson.htmlSafe;
        this.prettyPrinting = gson.prettyPrinting;
        this.lenient = gson.lenient;
        this.serializeSpecialFloatingPointValues = gson.serializeSpecialFloatingPointValues;
        this.longSerializationPolicy = gson.longSerializationPolicy;
        this.datePattern = gson.datePattern;
        this.dateStyle = gson.dateStyle;
        this.timeStyle = gson.timeStyle;
        arrayList.addAll(gson.builderFactories);
        arrayList2.addAll(gson.builderHierarchyFactories);
    }
}
