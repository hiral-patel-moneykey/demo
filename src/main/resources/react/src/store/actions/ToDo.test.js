import * as actionTypes from "./actionTypes";
import * as actions from "../actions";

describe("To Do actions are created", () => {

    it("should create add task action", () => {
        let task = "Some Task";

        const expectedAction = {
            type: actionTypes.ADD_TASK,
            taskDesc: task
        };

        expect(actions.addTask(task)).toEqual(expectedAction);
    })

    it("should create task success action", () => {
        let task = "Some Task";
        let responsedata = { data: "Some Data" }

        const expectedAction = {
            type: actionTypes.ADD_TASK_SUCCESS,
            responsedata: responsedata,
            taskDesc: task
        }

        expect(actions.addTaskSuccess(responsedata, task)).toEqual(expectedAction);
    })

})