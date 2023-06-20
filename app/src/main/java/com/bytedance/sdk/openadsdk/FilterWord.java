package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FilterWord {

    /* renamed from: a  reason: collision with root package name */
    private String f10557a;

    /* renamed from: b  reason: collision with root package name */
    private String f10558b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10559c;

    /* renamed from: d  reason: collision with root package name */
    private List<FilterWord> f10560d;

    public FilterWord(String str, String str2) {
        this.f10557a = str;
        this.f10558b = str2;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.f10560d == null) {
            this.f10560d = new ArrayList();
        }
        this.f10560d.add(filterWord);
    }

    public String getId() {
        return this.f10557a;
    }

    public boolean getIsSelected() {
        return this.f10559c;
    }

    public String getName() {
        return this.f10558b;
    }

    public List<FilterWord> getOptions() {
        return this.f10560d;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.f10560d;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.f10557a) || TextUtils.isEmpty(this.f10558b)) ? false : true;
    }

    public void setId(String str) {
        this.f10557a = str;
    }

    public void setIsSelected(boolean z10) {
        this.f10559c = z10;
    }

    public void setName(String str) {
        this.f10558b = str;
    }

    public FilterWord() {
    }
}
