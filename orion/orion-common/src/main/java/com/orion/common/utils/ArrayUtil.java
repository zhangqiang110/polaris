package com.orion.common.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public final class ArrayUtil {

	private ArrayUtil() {

	}

	/**
	 * 去除数组中每个元素的左右空格，同时删除全空格的元素
	 * @param arr
	 * @return
	 */
	public static String[] trimElems(String[] arr) {
		List<String> elems = new ArrayList<>();
		String elem = "";
		for (int i = 0; i < arr.length; i++) {
			if (StringUtils.isNotBlank(elem = arr[i].trim())) {
				elems.add(elem);
			}
		}
		return elems.toArray(new String[elems.size()]);
	}

}
