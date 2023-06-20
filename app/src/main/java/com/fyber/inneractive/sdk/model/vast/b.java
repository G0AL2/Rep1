package com.fyber.inneractive.sdk.model.vast;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public class b implements com.fyber.inneractive.sdk.response.i {

    /* renamed from: a  reason: collision with root package name */
    public String f17386a;

    /* renamed from: b  reason: collision with root package name */
    public String f17387b;

    /* renamed from: d  reason: collision with root package name */
    public PriorityQueue<m> f17389d;

    /* renamed from: f  reason: collision with root package name */
    public PriorityQueue<c> f17391f;

    /* renamed from: e  reason: collision with root package name */
    public final List<com.fyber.inneractive.sdk.measurement.i> f17390e = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public c f17392g = null;

    /* renamed from: h  reason: collision with root package name */
    public int f17393h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f17394i = 0;

    /* renamed from: c  reason: collision with root package name */
    public Map<q, List<String>> f17388c = new HashMap();

    public b(Comparator<m> comparator, Comparator<c> comparator2) {
        this.f17389d = new PriorityQueue<>(1, comparator);
        this.f17391f = new PriorityQueue<>(1, comparator2);
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public List<String> a(q qVar) {
        Map<q, List<String>> map = this.f17388c;
        if (map == null) {
            return null;
        }
        return map.get(qVar);
    }

    public List<m> b() {
        return new ArrayList(this.f17389d);
    }

    public List<com.fyber.inneractive.sdk.measurement.i> c() {
        return this.f17390e;
    }

    public int a() {
        return this.f17389d.size();
    }

    public void a(q qVar, String str) {
        List<String> list = this.f17388c.get(qVar);
        if (list == null) {
            list = new ArrayList<>();
            this.f17388c.put(qVar, list);
        }
        list.add(str);
    }
}
