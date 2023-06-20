package com.ironsource.mediationsdk.metadata;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class MetaData {

    /* renamed from: a  reason: collision with root package name */
    private String f27186a;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f27187b;

    /* renamed from: c  reason: collision with root package name */
    private List<MetaDataValueTypes> f27188c;

    /* loaded from: classes3.dex */
    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(String str, List<String> list) {
        this.f27186a = str;
        this.f27187b = list;
        this.f27188c = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f27188c.add(MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }

    public MetaData(String str, List<String> list, List<MetaDataValueTypes> list2) {
        this.f27186a = str;
        this.f27187b = list;
        this.f27188c = list2;
    }

    public String getMetaDataKey() {
        return this.f27186a;
    }

    public List<String> getMetaDataValue() {
        return this.f27187b;
    }

    public List<MetaDataValueTypes> getMetaDataValueType() {
        return this.f27188c;
    }
}
