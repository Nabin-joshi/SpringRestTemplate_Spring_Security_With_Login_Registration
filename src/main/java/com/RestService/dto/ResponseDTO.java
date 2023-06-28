/**
 * @author Umesh Bhujel <yoomesbhujel@gmail.com>
 * Since Dec 16, 2019
 */
package com.RestService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO<T> {
	private T data;
}
