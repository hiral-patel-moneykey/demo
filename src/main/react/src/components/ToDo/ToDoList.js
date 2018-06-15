import React from 'react';

const ToDoList = (props) => (
    props.tasks.map( task => {
        return (
                <input type="text" value={task} />
            )
        } )
)

export default ToDoList;