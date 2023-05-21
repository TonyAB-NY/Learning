package com.ny.javaBase;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * String  Set  List 互相装换
 */
public class StringSetListRevert {
    // test
    public static void main(String[] args) {
        String str = "vss@io@event_face@face_match@event_face_match";
        
        // 1. String to List (字符变数组)
        List<String> list =  str2List(str, "@");
//        List<String> list1 =  str2List(str, "#");
        
        // 2. List to String  (数组变字符串)
        String str_1 = list2Str(list, "@");
        
        // 3. String to Set
        Set<String> set_2 = string2Set(str, "@");
        
        // 4. Set to String
        
        // 5. Set to List
        
        // 6. List to Set
    }
    
    private static List<String> str2List(String str, String separator) {
        String[] split = str.split(separator);    // 这个是Array 长度不可修改, 
        return Arrays.asList(split);
    }

    private static String list2Str(List<String> list, String separator) {
        return String.join(separator, list);
    }

    private static Set<String> string2Set(String str, String s) {
        Set<String> capSet = new HashSet<>();
        String[] s1 = str.split("s");
        List<String> list = Arrays.asList(s1);
        capSet.addAll(list); // 这个方法可以直接加集合
        return capSet;
    }
}
