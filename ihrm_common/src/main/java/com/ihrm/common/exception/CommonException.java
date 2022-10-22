package com.ihrm.common.exception;

import com.ihrm.common.entity.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CommonException extends Exception {

    private ResultCode resultCode;


}
