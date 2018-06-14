import reducer from "./ToDo";
import * as actionTypes from "../actions/actionTypes";
import * as actions from "../actions";

describe("ToDo reducer", () => {

    it("Should return the initial state", () => {
        expect(reducer(undefined, {})).toEqual({
            tasks : []
        });
    })

    it("Should handle successful add task", () => {
        var addTaskSuccessAction = actions.addTaskSuccess({data: "some data"}, "Some task");
        var initialState = { tasks: [] };
        expect(reducer(initialState, addTaskSuccessAction)).toEqual({
            tasks : ["Some task"]
        });
    })

    it("Should handle failure in add task", () => {
        var addTaskFailureAction = actions.addTaskFail({error: "error"});
        var initialState = { tasks: [] };
        expect(reducer(initialState, addTaskFailureAction)).toEqual(initialState);
    })

});