package org.wso2.carbon.identity.workflow.engine.exception;

/**
 * Exception class to handle workflow engine exceptions.
 */
public class WorkflowEngineException extends java.lang.RuntimeException {

    private String errorCode;

    public WorkflowEngineException(String message, String errorCode) {

        super(message);
        this.errorCode = errorCode;
    }

    public WorkflowEngineException(String message, Throwable cause) {

        super(message, cause);
    }
}
