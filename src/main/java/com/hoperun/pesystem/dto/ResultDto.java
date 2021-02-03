package com.hoperun.pesystem.dto;
import com.hoperun.pesystem.enums.CustomizeCode;
import com.hoperun.pesystem.enums.CustomizeException;
import lombok.Data;
@Data
public class ResultDto<T> {
        private Integer code;
        private String message;
        private String status;
        private T data;

        //失败不带数据结果集
        public static <T> ResultDto<T> errorOf(Integer code, String message) {
            ResultDto<T> resultDto = new ResultDto<>();
            resultDto.setCode(code);
            resultDto.setMessage(message);
            resultDto.setStatus("请求失败(4000)");
            return resultDto;
        }
        //失败带数据结果集
        public static <T> ResultDto<T> errorWithData(Integer code, String message,T t) {
            ResultDto<T> resultDto = new ResultDto<>();
            resultDto.setCode(code);
            resultDto.setMessage(message);
            resultDto.setStatus("请求失败(4000)");
            resultDto.setData(t);
            return resultDto;
        }
        //error封装枚举信息
        public static <T> ResultDto<T> errorOf(CustomizeCode errorCode) {
            return errorOf(errorCode.getCode(), errorCode.getMessage());
        }
        //error封装枚举信息和数据
        public static <T> ResultDto<T> errorWithData(CustomizeCode errorCode,T t) {
            return errorWithData(errorCode.getCode(), errorCode.getMessage(),t);
        }



        //成功不带数据结果集
        public static <T> ResultDto<T> okOf(Integer code, String message) {
            ResultDto<T> resultDto = new ResultDto<>();
            resultDto.setCode(code);
            resultDto.setMessage(message);
            resultDto.setStatus("请求成功(2000)");
            return resultDto;
        }
        //成功带数据结果集
        public static <T> ResultDto<T> okWithData(Integer code, String message,T t) {
            ResultDto<T> resultDto = new ResultDto<>();
            resultDto.setCode(code);
            resultDto.setMessage(message);
            resultDto.setStatus("请求成功(2000)");
            resultDto.setData(t);
            return resultDto;
        }
        //ok封装枚举信息
        public static <T> ResultDto<T> okOf(CustomizeCode okCode) {
            return okOf(okCode.getCode(), okCode.getMessage());
        }
        //ok封装枚举信息和数据
        public static <T> ResultDto<T> okWithData(CustomizeCode okCode,T t) {
            return okWithData(okCode.getCode(), okCode.getMessage(),t);
        }




        //异常不带数据结果集
        public static <T> ResultDto<T> exceptionOf(Integer code, String message) {
            ResultDto<T> resultDto = new ResultDto<>();
            resultDto.setCode(code);
            resultDto.setMessage(message);
            resultDto.setStatus("请求异常(3000)");
            return resultDto;
        }
        //Exception封装枚举信息
        public static <T> ResultDto<T> exceptionOf(CustomizeException e) {
            return exceptionOf(e.getCode(), e.getMessage());
        }

    }


