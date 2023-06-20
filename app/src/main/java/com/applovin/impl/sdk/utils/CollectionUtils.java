package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.applovin.impl.sdk.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CollectionUtils {
    public static List<String> explode(String str) {
        return explode(str, ",\\s*");
    }

    public static List<String> explode(String str, String str2) {
        return TextUtils.isEmpty(str) ? Collections.emptyList() : Arrays.asList(str.split(str2));
    }

    public static boolean getBoolean(Map<String, Object> map, String str) {
        return getBoolean(map, str, false);
    }

    public static boolean getBoolean(Map<String, Object> map, String str, boolean z10) {
        if (map != null && map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                return Boolean.parseBoolean((String) obj);
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            if (obj instanceof Number) {
                return ((Number) obj).intValue() >= 1;
            }
        }
        return z10;
    }

    public static String implode(Collection<String> collection, int i10) {
        return implode(collection, ",", i10);
    }

    public static String implode(Collection<String> collection, String str, int i10) {
        if (str != null) {
            if (collection == null || collection.size() < 1) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            int i11 = 0;
            for (String str2 : collection) {
                if (i11 >= i10) {
                    break;
                }
                i11++;
                sb2.append(str2);
                sb2.append(str);
            }
            if (sb2.length() > str.length()) {
                sb2.setLength(sb2.length() - str.length());
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("No glue specified");
    }

    public static <K, V> Map<K, V> map(K k10, V v10) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(k10, v10);
        return hashMap;
    }

    public static List<String> removeTrimmedEmptyStrings(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            String trim = str.trim();
            if (!TextUtils.isEmpty(trim)) {
                arrayList.add(trim);
            }
        }
        return arrayList;
    }

    public static <T> List<T> synchronizedList() {
        return synchronizedList(-1);
    }

    public static <T> List<T> synchronizedList(int i10) {
        return i10 >= 0 ? Collections.synchronizedList(new ArrayList(i10)) : Collections.synchronizedList(new ArrayList());
    }

    public static Bundle toBundle(Map<String, ?> map) {
        if (map == null || map.size() == 0) {
            return new Bundle();
        }
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof Map) {
                bundle.putBundle(str, toBundle((Map) obj));
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            }
        }
        return bundle;
    }

    public static JSONArray toJSONArray(List<String> list) {
        if (list == null) {
            return new JSONArray();
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : list) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    public static JSONObject toJson(Map<String, ?> map) throws JSONException {
        if (map == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    public static String toJsonString(Map<String, Object> map, String str) {
        try {
            return toJson(map).toString();
        } catch (JSONException e10) {
            if (v.a()) {
                v.c("CollectionUtils", "Failed to convert map '" + map + "' to JSON string.", e10);
            }
            return str;
        }
    }
}
